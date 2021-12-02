package subProj_1717

import subProj_1717.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1717")
    name = "subProj 1717"

    buildType(subProj_bt_1717_4)
    buildType(subProj_bt_1717_5)
    buildType(subProj_bt_1717_2)
    buildType(subProj_bt_1717_3)
    buildType(subProj_bt_1717_0)
    buildType(subProj_bt_1717_1)
})
