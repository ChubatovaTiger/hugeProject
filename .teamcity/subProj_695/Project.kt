package subProj_695

import subProj_695.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_695")
    name = "subProj 695"

    buildType(subProj_bt_695_2)
    buildType(subProj_bt_695_3)
    buildType(subProj_bt_695_4)
    buildType(subProj_bt_695_5)
    buildType(subProj_bt_695_0)
    buildType(subProj_bt_695_1)
})
