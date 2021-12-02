package subProj_1501

import subProj_1501.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1501")
    name = "subProj 1501"

    buildType(subProj_bt_1501_5)
    buildType(subProj_bt_1501_0)
    buildType(subProj_bt_1501_2)
    buildType(subProj_bt_1501_1)
    buildType(subProj_bt_1501_4)
    buildType(subProj_bt_1501_3)
})
