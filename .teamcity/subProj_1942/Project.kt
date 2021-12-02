package subProj_1942

import subProj_1942.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1942")
    name = "subProj 1942"

    buildType(subProj_bt_1942_3)
    buildType(subProj_bt_1942_2)
    buildType(subProj_bt_1942_1)
    buildType(subProj_bt_1942_0)
    buildType(subProj_bt_1942_5)
    buildType(subProj_bt_1942_4)
})
