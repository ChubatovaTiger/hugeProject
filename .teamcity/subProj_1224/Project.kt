package subProj_1224

import subProj_1224.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1224")
    name = "subProj 1224"

    buildType(subProj_bt_1224_0)
    buildType(subProj_bt_1224_1)
    buildType(subProj_bt_1224_2)
    buildType(subProj_bt_1224_3)
    buildType(subProj_bt_1224_4)
    buildType(subProj_bt_1224_5)
})
