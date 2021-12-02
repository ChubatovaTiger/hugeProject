package subProj_1994

import subProj_1994.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1994")
    name = "subProj 1994"

    buildType(subProj_bt_1994_4)
    buildType(subProj_bt_1994_3)
    buildType(subProj_bt_1994_5)
    buildType(subProj_bt_1994_0)
    buildType(subProj_bt_1994_2)
    buildType(subProj_bt_1994_1)
})
