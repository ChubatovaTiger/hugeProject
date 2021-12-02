package subProj_167

import subProj_167.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_167")
    name = "subProj 167"

    buildType(subProj_bt_167_0)
    buildType(subProj_bt_167_1)
    buildType(subProj_bt_167_2)
    buildType(subProj_bt_167_3)
    buildType(subProj_bt_167_4)
    buildType(subProj_bt_167_5)
})
