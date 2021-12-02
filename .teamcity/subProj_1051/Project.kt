package subProj_1051

import subProj_1051.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1051")
    name = "subProj 1051"

    buildType(subProj_bt_1051_4)
    buildType(subProj_bt_1051_3)
    buildType(subProj_bt_1051_5)
    buildType(subProj_bt_1051_0)
    buildType(subProj_bt_1051_2)
    buildType(subProj_bt_1051_1)
})
