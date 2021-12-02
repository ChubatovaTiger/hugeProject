package subProj_498

import subProj_498.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_498")
    name = "subProj 498"

    buildType(subProj_bt_498_5)
    buildType(subProj_bt_498_1)
    buildType(subProj_bt_498_2)
    buildType(subProj_bt_498_3)
    buildType(subProj_bt_498_4)
    buildType(subProj_bt_498_0)
})
