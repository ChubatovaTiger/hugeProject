package subProj_1542

import subProj_1542.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1542")
    name = "subProj 1542"

    buildType(subProj_bt_1542_3)
    buildType(subProj_bt_1542_2)
    buildType(subProj_bt_1542_1)
    buildType(subProj_bt_1542_0)
    buildType(subProj_bt_1542_5)
    buildType(subProj_bt_1542_4)
})
