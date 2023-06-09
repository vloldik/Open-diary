package ru.vladik.opendiary.ext

import ru.vladik.opendiary.dnevnikapi.models.extended.ExtendedLesson
import ru.vladik.opendiary.dnevnikapi.models.v2.LessonV2
import ru.vladik.opendiary.dnevnikapi.models.v2.MarkV2
import ru.vladik.opendiary.dnevnikapi.models.v7.DaybookLessonNoPayment

fun DaybookLessonNoPayment.toExtendedLesson(lessonV2: LessonV2? = null,
marks: ArrayList<MarkV2>? = null) = ExtendedLesson(this, lessonV2, marks)