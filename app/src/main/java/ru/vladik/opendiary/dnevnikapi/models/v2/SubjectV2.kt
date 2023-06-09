package ru.vladik.opendiary.dnevnikapi.models.v2

import ru.vladik.opendiary.dnevnikapi.models.Entity

data class SubjectV2(
     val name: String? = null,
     val knowledgeArea: String? = null,
     override val id: Long? = null,
     val fgosSubjectId: Long? = null
) : Entity