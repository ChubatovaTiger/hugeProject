package subProj_1191

import subProj_1191.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1191")
    name = "subProj 1191"

    buildType(subProj_bt_1191_1)
    buildType(subProj_bt_1191_0)
    buildType(subProj_bt_1191_3)
    buildType(subProj_bt_1191_2)
    buildType(subProj_bt_1191_5)
    buildType(subProj_bt_1191_4)
})
