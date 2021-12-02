package subProj_1967

import subProj_1967.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1967")
    name = "subProj 1967"

    buildType(subProj_bt_1967_0)
    buildType(subProj_bt_1967_5)
    buildType(subProj_bt_1967_1)
    buildType(subProj_bt_1967_2)
    buildType(subProj_bt_1967_3)
    buildType(subProj_bt_1967_4)
})
