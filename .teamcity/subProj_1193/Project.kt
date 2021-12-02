package subProj_1193

import subProj_1193.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1193")
    name = "subProj 1193"

    buildType(subProj_bt_1193_5)
    buildType(subProj_bt_1193_4)
    buildType(subProj_bt_1193_1)
    buildType(subProj_bt_1193_0)
    buildType(subProj_bt_1193_3)
    buildType(subProj_bt_1193_2)
})
