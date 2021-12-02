package subProj_1739

import subProj_1739.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1739")
    name = "subProj 1739"

    buildType(subProj_bt_1739_5)
    buildType(subProj_bt_1739_4)
    buildType(subProj_bt_1739_3)
    buildType(subProj_bt_1739_2)
    buildType(subProj_bt_1739_1)
    buildType(subProj_bt_1739_0)
})
