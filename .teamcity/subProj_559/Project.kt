package subProj_559

import subProj_559.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_559")
    name = "subProj 559"

    buildType(subProj_bt_559_0)
    buildType(subProj_bt_559_1)
    buildType(subProj_bt_559_2)
    buildType(subProj_bt_559_3)
    buildType(subProj_bt_559_4)
    buildType(subProj_bt_559_5)
})
