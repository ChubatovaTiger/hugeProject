package subProj_1891

import subProj_1891.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1891")
    name = "subProj 1891"

    buildType(subProj_bt_1891_5)
    buildType(subProj_bt_1891_4)
    buildType(subProj_bt_1891_3)
    buildType(subProj_bt_1891_2)
    buildType(subProj_bt_1891_1)
    buildType(subProj_bt_1891_0)
})
