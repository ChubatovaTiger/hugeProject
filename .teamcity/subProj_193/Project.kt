package subProj_193

import subProj_193.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_193")
    name = "subProj 193"

    buildType(subProj_bt_193_3)
    buildType(subProj_bt_193_4)
    buildType(subProj_bt_193_1)
    buildType(subProj_bt_193_2)
    buildType(subProj_bt_193_5)
    buildType(subProj_bt_193_0)
})
