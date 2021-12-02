package subProj_1947

import subProj_1947.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1947")
    name = "subProj 1947"

    buildType(subProj_bt_1947_2)
    buildType(subProj_bt_1947_1)
    buildType(subProj_bt_1947_0)
    buildType(subProj_bt_1947_5)
    buildType(subProj_bt_1947_4)
    buildType(subProj_bt_1947_3)
})
