package subProj_1311

import subProj_1311.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1311")
    name = "subProj 1311"

    buildType(subProj_bt_1311_5)
    buildType(subProj_bt_1311_4)
    buildType(subProj_bt_1311_1)
    buildType(subProj_bt_1311_0)
    buildType(subProj_bt_1311_3)
    buildType(subProj_bt_1311_2)
})
