package subProj_1594

import subProj_1594.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1594")
    name = "subProj 1594"

    buildType(subProj_bt_1594_0)
    buildType(subProj_bt_1594_2)
    buildType(subProj_bt_1594_1)
    buildType(subProj_bt_1594_4)
    buildType(subProj_bt_1594_3)
    buildType(subProj_bt_1594_5)
})
