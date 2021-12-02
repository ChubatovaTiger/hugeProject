package subProj_1726

import subProj_1726.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1726")
    name = "subProj 1726"

    buildType(subProj_bt_1726_4)
    buildType(subProj_bt_1726_5)
    buildType(subProj_bt_1726_2)
    buildType(subProj_bt_1726_3)
    buildType(subProj_bt_1726_0)
    buildType(subProj_bt_1726_1)
})
