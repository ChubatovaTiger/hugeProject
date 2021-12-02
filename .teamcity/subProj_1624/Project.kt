package subProj_1624

import subProj_1624.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1624")
    name = "subProj 1624"

    buildType(subProj_bt_1624_3)
    buildType(subProj_bt_1624_4)
    buildType(subProj_bt_1624_5)
    buildType(subProj_bt_1624_0)
    buildType(subProj_bt_1624_1)
    buildType(subProj_bt_1624_2)
})
