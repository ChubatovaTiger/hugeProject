package subProj_1266

import subProj_1266.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1266")
    name = "subProj 1266"

    buildType(subProj_bt_1266_2)
    buildType(subProj_bt_1266_1)
    buildType(subProj_bt_1266_4)
    buildType(subProj_bt_1266_3)
    buildType(subProj_bt_1266_5)
    buildType(subProj_bt_1266_0)
})
