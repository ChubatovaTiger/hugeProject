package subProj_1188

import subProj_1188.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1188")
    name = "subProj 1188"

    buildType(subProj_bt_1188_2)
    buildType(subProj_bt_1188_3)
    buildType(subProj_bt_1188_4)
    buildType(subProj_bt_1188_5)
    buildType(subProj_bt_1188_0)
    buildType(subProj_bt_1188_1)
})
