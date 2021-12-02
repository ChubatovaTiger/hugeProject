package subProj_1384

import subProj_1384.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1384")
    name = "subProj 1384"

    buildType(subProj_bt_1384_4)
    buildType(subProj_bt_1384_5)
    buildType(subProj_bt_1384_0)
    buildType(subProj_bt_1384_1)
    buildType(subProj_bt_1384_2)
    buildType(subProj_bt_1384_3)
})
