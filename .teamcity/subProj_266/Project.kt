package subProj_266

import subProj_266.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_266")
    name = "subProj 266"

    buildType(subProj_bt_266_4)
    buildType(subProj_bt_266_5)
    buildType(subProj_bt_266_2)
    buildType(subProj_bt_266_3)
    buildType(subProj_bt_266_0)
    buildType(subProj_bt_266_1)
})
