package subProj_1563

import subProj_1563.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1563")
    name = "subProj 1563"

    buildType(subProj_bt_1563_0)
    buildType(subProj_bt_1563_5)
    buildType(subProj_bt_1563_1)
    buildType(subProj_bt_1563_2)
    buildType(subProj_bt_1563_3)
    buildType(subProj_bt_1563_4)
})
