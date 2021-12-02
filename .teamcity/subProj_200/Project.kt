package subProj_200

import subProj_200.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_200")
    name = "subProj 200"

    buildType(subProj_bt_200_2)
    buildType(subProj_bt_200_3)
    buildType(subProj_bt_200_4)
    buildType(subProj_bt_200_5)
    buildType(subProj_bt_200_0)
    buildType(subProj_bt_200_1)
})
