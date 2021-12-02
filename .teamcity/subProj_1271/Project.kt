package subProj_1271

import subProj_1271.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1271")
    name = "subProj 1271"

    buildType(subProj_bt_1271_1)
    buildType(subProj_bt_1271_2)
    buildType(subProj_bt_1271_0)
    buildType(subProj_bt_1271_5)
    buildType(subProj_bt_1271_3)
    buildType(subProj_bt_1271_4)
})
