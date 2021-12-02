package subProj_1259

import subProj_1259.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1259")
    name = "subProj 1259"

    buildType(subProj_bt_1259_0)
    buildType(subProj_bt_1259_2)
    buildType(subProj_bt_1259_1)
    buildType(subProj_bt_1259_4)
    buildType(subProj_bt_1259_3)
    buildType(subProj_bt_1259_5)
})
