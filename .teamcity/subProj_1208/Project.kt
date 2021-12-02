package subProj_1208

import subProj_1208.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1208")
    name = "subProj 1208"

    buildType(subProj_bt_1208_5)
    buildType(subProj_bt_1208_4)
    buildType(subProj_bt_1208_3)
    buildType(subProj_bt_1208_2)
    buildType(subProj_bt_1208_1)
    buildType(subProj_bt_1208_0)
})
