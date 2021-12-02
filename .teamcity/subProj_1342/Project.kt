package subProj_1342

import subProj_1342.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1342")
    name = "subProj 1342"

    buildType(subProj_bt_1342_0)
    buildType(subProj_bt_1342_1)
    buildType(subProj_bt_1342_4)
    buildType(subProj_bt_1342_5)
    buildType(subProj_bt_1342_2)
    buildType(subProj_bt_1342_3)
})
