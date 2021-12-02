package subProj_1649

import subProj_1649.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1649")
    name = "subProj 1649"

    buildType(subProj_bt_1649_1)
    buildType(subProj_bt_1649_0)
    buildType(subProj_bt_1649_3)
    buildType(subProj_bt_1649_2)
    buildType(subProj_bt_1649_5)
    buildType(subProj_bt_1649_4)
})
