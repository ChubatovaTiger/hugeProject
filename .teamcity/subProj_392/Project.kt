package subProj_392

import subProj_392.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_392")
    name = "subProj 392"

    buildType(subProj_bt_392_4)
    buildType(subProj_bt_392_5)
    buildType(subProj_bt_392_2)
    buildType(subProj_bt_392_3)
    buildType(subProj_bt_392_0)
    buildType(subProj_bt_392_1)
})
