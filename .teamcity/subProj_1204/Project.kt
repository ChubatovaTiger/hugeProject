package subProj_1204

import subProj_1204.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1204")
    name = "subProj 1204"

    buildType(subProj_bt_1204_5)
    buildType(subProj_bt_1204_4)
    buildType(subProj_bt_1204_3)
    buildType(subProj_bt_1204_2)
    buildType(subProj_bt_1204_1)
    buildType(subProj_bt_1204_0)
})
