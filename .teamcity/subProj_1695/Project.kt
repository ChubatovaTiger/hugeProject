package subProj_1695

import subProj_1695.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1695")
    name = "subProj 1695"

    buildType(subProj_bt_1695_0)
    buildType(subProj_bt_1695_4)
    buildType(subProj_bt_1695_3)
    buildType(subProj_bt_1695_2)
    buildType(subProj_bt_1695_1)
    buildType(subProj_bt_1695_5)
})
