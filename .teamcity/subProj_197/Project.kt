package subProj_197

import subProj_197.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_197")
    name = "subProj 197"

    buildType(subProj_bt_197_0)
    buildType(subProj_bt_197_3)
    buildType(subProj_bt_197_4)
    buildType(subProj_bt_197_1)
    buildType(subProj_bt_197_2)
    buildType(subProj_bt_197_5)
})
