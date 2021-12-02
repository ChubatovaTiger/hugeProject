package subProj_1622

import subProj_1622.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1622")
    name = "subProj 1622"

    buildType(subProj_bt_1622_5)
    buildType(subProj_bt_1622_0)
    buildType(subProj_bt_1622_1)
    buildType(subProj_bt_1622_2)
    buildType(subProj_bt_1622_3)
    buildType(subProj_bt_1622_4)
})
