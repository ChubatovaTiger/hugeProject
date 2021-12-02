package subProj_296

import subProj_296.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_296")
    name = "subProj 296"

    buildType(subProj_bt_296_0)
    buildType(subProj_bt_296_1)
    buildType(subProj_bt_296_2)
    buildType(subProj_bt_296_3)
    buildType(subProj_bt_296_4)
    buildType(subProj_bt_296_5)
})
