package subProj_615

import subProj_615.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_615")
    name = "subProj 615"

    buildType(subProj_bt_615_3)
    buildType(subProj_bt_615_2)
    buildType(subProj_bt_615_5)
    buildType(subProj_bt_615_4)
    buildType(subProj_bt_615_1)
    buildType(subProj_bt_615_0)
})
