package subProj_1261

import subProj_1261.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1261")
    name = "subProj 1261"

    buildType(subProj_bt_1261_1)
    buildType(subProj_bt_1261_0)
    buildType(subProj_bt_1261_3)
    buildType(subProj_bt_1261_2)
    buildType(subProj_bt_1261_5)
    buildType(subProj_bt_1261_4)
})
