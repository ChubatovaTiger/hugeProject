package subProj_1929

import subProj_1929.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1929")
    name = "subProj 1929"

    buildType(subProj_bt_1929_5)
    buildType(subProj_bt_1929_3)
    buildType(subProj_bt_1929_4)
    buildType(subProj_bt_1929_1)
    buildType(subProj_bt_1929_2)
    buildType(subProj_bt_1929_0)
})
