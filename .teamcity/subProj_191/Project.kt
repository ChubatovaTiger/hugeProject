package subProj_191

import subProj_191.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_191")
    name = "subProj 191"

    buildType(subProj_bt_191_5)
    buildType(subProj_bt_191_3)
    buildType(subProj_bt_191_4)
    buildType(subProj_bt_191_1)
    buildType(subProj_bt_191_2)
    buildType(subProj_bt_191_0)
})
