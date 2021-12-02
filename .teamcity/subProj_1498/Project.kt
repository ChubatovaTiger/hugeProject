package subProj_1498

import subProj_1498.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1498")
    name = "subProj 1498"

    buildType(subProj_bt_1498_5)
    buildType(subProj_bt_1498_4)
    buildType(subProj_bt_1498_3)
    buildType(subProj_bt_1498_2)
    buildType(subProj_bt_1498_1)
    buildType(subProj_bt_1498_0)
})
