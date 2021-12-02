package subProj_1950

import subProj_1950.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1950")
    name = "subProj 1950"

    buildType(subProj_bt_1950_2)
    buildType(subProj_bt_1950_1)
    buildType(subProj_bt_1950_0)
    buildType(subProj_bt_1950_5)
    buildType(subProj_bt_1950_4)
    buildType(subProj_bt_1950_3)
})
