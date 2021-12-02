package subProj_624

import subProj_624.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_624")
    name = "subProj 624"

    buildType(subProj_bt_624_5)
    buildType(subProj_bt_624_4)
    buildType(subProj_bt_624_1)
    buildType(subProj_bt_624_0)
    buildType(subProj_bt_624_3)
    buildType(subProj_bt_624_2)
})
