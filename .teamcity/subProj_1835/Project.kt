package subProj_1835

import subProj_1835.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1835")
    name = "subProj 1835"

    buildType(subProj_bt_1835_0)
    buildType(subProj_bt_1835_5)
    buildType(subProj_bt_1835_2)
    buildType(subProj_bt_1835_1)
    buildType(subProj_bt_1835_4)
    buildType(subProj_bt_1835_3)
})
