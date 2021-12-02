package subProj_1961

import subProj_1961.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1961")
    name = "subProj 1961"

    buildType(subProj_bt_1961_3)
    buildType(subProj_bt_1961_4)
    buildType(subProj_bt_1961_5)
    buildType(subProj_bt_1961_0)
    buildType(subProj_bt_1961_1)
    buildType(subProj_bt_1961_2)
})
