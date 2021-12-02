package subProj_400

import subProj_400.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_400")
    name = "subProj 400"

    buildType(subProj_bt_400_0)
    buildType(subProj_bt_400_1)
    buildType(subProj_bt_400_2)
    buildType(subProj_bt_400_3)
    buildType(subProj_bt_400_4)
    buildType(subProj_bt_400_5)
})
