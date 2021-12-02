package subProj_1292

import subProj_1292.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1292")
    name = "subProj 1292"

    buildType(subProj_bt_1292_3)
    buildType(subProj_bt_1292_2)
    buildType(subProj_bt_1292_1)
    buildType(subProj_bt_1292_0)
    buildType(subProj_bt_1292_5)
    buildType(subProj_bt_1292_4)
})
