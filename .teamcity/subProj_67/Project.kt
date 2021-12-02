package subProj_67

import subProj_67.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_67")
    name = "subProj 67"

    buildType(subProj_bt_67_0)
    buildType(subProj_bt_67_3)
    buildType(subProj_bt_67_4)
    buildType(subProj_bt_67_1)
    buildType(subProj_bt_67_2)
    buildType(subProj_bt_67_5)
})
