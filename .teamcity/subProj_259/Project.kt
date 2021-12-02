package subProj_259

import subProj_259.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_259")
    name = "subProj 259"

    buildType(subProj_bt_259_4)
    buildType(subProj_bt_259_5)
    buildType(subProj_bt_259_2)
    buildType(subProj_bt_259_3)
    buildType(subProj_bt_259_0)
    buildType(subProj_bt_259_1)
})
