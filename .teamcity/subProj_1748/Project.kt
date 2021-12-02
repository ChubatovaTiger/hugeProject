package subProj_1748

import subProj_1748.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1748")
    name = "subProj 1748"

    buildType(subProj_bt_1748_5)
    buildType(subProj_bt_1748_4)
    buildType(subProj_bt_1748_3)
    buildType(subProj_bt_1748_2)
    buildType(subProj_bt_1748_1)
    buildType(subProj_bt_1748_0)
})
