package subProj_722

import subProj_722.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_722")
    name = "subProj 722"

    buildType(subProj_bt_722_5)
    buildType(subProj_bt_722_0)
    buildType(subProj_bt_722_4)
    buildType(subProj_bt_722_3)
    buildType(subProj_bt_722_2)
    buildType(subProj_bt_722_1)
})
